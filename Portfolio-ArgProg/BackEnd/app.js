const express = require('express');
const mysql = require('mysql');
const app = express();
const PORT = 3000;

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'Cradleoffilth887',
  database: 'midatabase',
});

db.connect((err) => {
  if (err) {
    console.error('Error de conexión a MySQL:', err);
  } else {
    console.log('Conectado a MySQL');
  }
});

app.listen(PORT, () => {
  console.log(`Servidor escuchando en el puerto ${PORT}`);
});

// En tu archivo app.js o en un archivo de rutas
app.get('/test', (req, res) => {
  db.query('SELECT 1 + 1 as result', (err, results) => {
    if (err) {
      return res.status(500).send(err);
    }
    res.json({ result: results[0].result });
  });
});

// En tu archivo app.js o donde configures tu aplicación
const express = require('express');
const session = require('express-session');
const bcrypt = require('bcrypt');
const mysql = require('mysql');
const db = require('./config/db'); // Asegúrate de configurar correctamente tu conexión a MySQL


app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(session({
  secret: 'tu_secreto', // Cambia esto con una cadena secreta más segura
  resave: false,
  saveUninitialized: true
}));

// Ruta de inicio de sesión
app.post('/login', async (req, res) => {
  const { username, password } = req.body;

  try {
    const user = await getUserByUsername(username);

    if (user && await bcrypt.compare(password, user.password)) {
      // Autenticación exitosa
      req.session.userId = user.id;
      res.json({ success: true, message: 'Inicio de sesión exitoso' });
    } else {
      // Credenciales incorrectas
      res.json({ success: false, message: 'Credenciales incorrectas' });
    }
  } catch (error) {
    console.error(error);
    res.status(500).json({ success: false, message: 'Error en el servidor' });
  }
});

// Función para obtener un usuario por nombre de usuario
function getUserByUsername(username) {
  return new Promise((resolve, reject) => {
    const query = 'SELECT * FROM users WHERE username = ?';
    db.query(query, [username], (err, results) => {
      if (err) {
        reject(err);
      } else {
        resolve(results[0]);
      }
    });
  });
}


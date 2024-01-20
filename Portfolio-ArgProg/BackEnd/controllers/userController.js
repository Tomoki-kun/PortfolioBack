// En tu archivo controllers/userController.js
const db = require('../db'); // Importa tu conexión a MySQL

exports.getUserById = (req, res) => {
  const userId = req.params.userId;

  db.query('SELECT * FROM users WHERE id = ?', [userId], (err, results) => {
    if (err) {
      return res.status(500).send(err);
    }
    return res.json(results[0]);
  });
};

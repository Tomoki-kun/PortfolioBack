const mongoose = require('mongoose');

const userSchema = new mongoose.Schema({
  nombre: String,
  apellido: String,
  foto: String,
  descripcion: String,
  acercaDe: String,
  softSkills: [String],
  hardSkills: [String],
});

module.exports = mongoose.model('User', userSchema);

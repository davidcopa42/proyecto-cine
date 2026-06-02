function cargarCines() {
  fetch("http://localhost:9000/api/v1/cines")
    .then(res => res.json())
    .then(data => mostrarCines(data))
    .catch(err => console.error(err));
}

function mostrarCines(cines) {
  const contenedor = document.getElementById("contenedor");
  contenedor.innerHTML = "";

  cines.forEach(cine => {

    let html = `
      <div class="cine">
        <h2>${cine.nombre}</h2>
        <p><b>Dirección:</b> ${cine.direccion}</p>

        <div class="section">
          <h3>Empleados</h3>
          <ul>
            ${cine.empleados?.map(e => `<li>${e.nombre} - DNI: ${e.dni}</li>`).join("")}
          </ul>
        </div>

        <div class="section">
          <h3>Películas</h3>
          <ul>
            ${cine.peliculas?.map(p => `<li>${p.titulo} (${p.genero})</li>`).join("")}
          </ul>
        </div>

        <div class="section">
          <h3>Salas</h3>
          <ul>
            ${cine.salas?.map(s => `<li>Sala ${s.numero} - Cap: ${s.capacidad}</li>`).join("")}
          </ul>
        </div>

        <div class="section">
          <h3>Salas VIP</h3>
          <ul>
            ${cine.salasVip?.map(v => `<li>Sala ${v.numero} - ${v.beneficios}</li>`).join("")}
          </ul>
        </div>

        <div class="section">
          <h3>Ventas</h3>
          <ul>
            ${cine.ventas?.map(v =>
              `<li>Fecha: ${v.fecha} - Clientes: ${v.clientes?.map(c => c.nombre).join(", ")}</li>`
            ).join("")}
          </ul>
        </div>

      </div>
    `;

    contenedor.innerHTML += html;
  });
}
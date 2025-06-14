// Saludo
document.getElementById('saludoForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const nombre = document.getElementById('nombre').value;
    fetch(`/holamundo?nombre=${encodeURIComponent(nombre)}`)
        .then(res => res.text())
        .then(html => {
            document.getElementById('saludoResultado').innerHTML = html;
        });
});

// Área, perímetro e hipotenusa
document.getElementById('areaForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const base = document.getElementById('base').value;
    const altura = document.getElementById('altura').value;
    const radio = document.getElementById('radio').value;
    let url = `/area?base=${encodeURIComponent(base)}&altura=${encodeURIComponent(altura)}`;
    if (radio) {
        url += `&radio=${encodeURIComponent(radio)}`;
    }
    fetch(url)
        .then(res => res.text())
        .then(html => {
            document.getElementById('areaResultado').innerHTML = html;
        });
});
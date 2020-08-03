
alert('funca');
new Chart(document.getElementById("accidente"), {
  type: "doughnut",
  data: {
    labels: ["Capacitaciones", "Mejoras", "Asesorias"],
    datasets: [
      {
        label: "My First Dataset",
        data: [10, 5, 2],
        backgroundColor: [
          "rgb(63, 205, 67)",
          "rgb(223, 22, 19)",
          "rgb(249, 245, 44)",
        ],
      },
    ],
  },
});
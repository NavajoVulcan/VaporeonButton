let playBtn = document.getElementsByClassName("VAPOREON");

const audio = new Audio("./Vaporeonsound.mp3");

playBtn[0].addEventListener("click", (e) => {
  audio.play();
});

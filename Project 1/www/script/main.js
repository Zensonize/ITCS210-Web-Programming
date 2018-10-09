<<<<<<< .merge_file_5IMyL4
var slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}
=======
$(document).ready(function(){
  resizeScreen();
})

$(".button-collapse").sideNav();

//enable navbar dropdown on hover
$('.dropdown-button').dropdown({
  'hover': true
});

//resize container size when screen resize
$(window).resize(function () {
  resizeScreen();
});

//resize screen respect to the content height
function resizeScreen(){
  var window_size = $(window).height();
  var contentScreen_size = window_size - $('.navbar-fixed').height();
  $('.topictitle').height(contentScreen_size);
  if($('#contentscontainer').height() > (contentScreen_size)) {
      $('.content-Block').height($('#contentscontainer').height())
  }
  else{
      $('.content-Block').height(contentScreen_size);
  }
}

//toggle grayscale button
$('#ActivateGrayScale').click(function(){
  $('body').toggleClass('bw');
})

//toggle large font
var largeFont_toggle = false;

$('#ActivateLargeText').click(function(){
    $('h4').toggleClass('large-font');
    $('h5').toggleClass('large-font');
    $('h6').toggleClass('large-font');
    $('p').toggleClass('large-font');
    console.log(largeFont_toggle)
    if(largeFont_toggle == false){
        resizeScreen();
        largeFont_toggle = true;
    }
    else{
        resizeScreen();
        largeFont_toggle = false;
    }
});
>>>>>>> .merge_file_dRmZzo

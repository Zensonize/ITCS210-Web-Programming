$(document).ready(function(){
  resizeScreen();
  resizeLogo();
})

$(".button-collapse").sideNav();

//enable navbar dropdown on hover
$('.dropdown-button').dropdown({
  'hover': true
});

//resize container size when screen resize
$(window).resize(function () {
  resizeScreen();
  resizeLogo();
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

//resize logo
function resizeLogo(){
  var navsize = $('.navbar-fixed').height();
  $('#logo').height(navsize-5);
}
//toggle grayscale button
$('#ActivateGrayScale').click(function(){
  $('body').toggleClass('bw');
})

//toggle large font
var largeFont_toggle = false;

$('#ActivateLargeText').click(function(){
    $('.topicSub').toggleClass('topicSub-large');
    $('.contentSub1').toggleClass('contentSub1-large');
    $('.contentSub2').toggleClass('contentSub2-large');
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

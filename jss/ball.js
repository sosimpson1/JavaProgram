
function ball()
{
//The ball itself
this.startAngle=0;
this.endAngle=360*Math.PI * 2;
this.radius=40;
this.drawBall = true;

//location for my ball
this.x = canvs/width/2;
this.y = canvas/height/2;

//coloring my ball
this.color = " #00FFFF";


//draw function

this.draw = function()
{
context.fillStyle = this.color;
context.beginPath();
content.arc(this. x,this. y, this. redius, this.startAngle, this.Endangle, this.drawBall);
context.fill();
	
}
 
 
 
 }
 
 
 //My main Javascript
 
 //Variables to use
var canvas;
var context;
var ball;

canvas = documnet.getElementById("canvas");
context = canvas.getcotnext("2d");

//Creates my ball function based off of what is on canvas for ball
var ball = new Ball();
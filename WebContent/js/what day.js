/**
 * 
 */
//星期几
/*var d=new Date();
var weekday=new Array(7);
weekday[0]="sunday";
weekday[1]="monday";
weekday[2]="Tuesday";
weekday[3]="wednesday";
weekday[4]="Thursday";
weekday[5]="Friday";
weekday[6]="Saturday";
document.write("Today it is "+weekday[d.getDay()]);

//算出从1970年到现在发生了多少年
var minutes =1000*60;
var hours=minutes*60;
var days=hours*24;
var years=days*365;
var t=d.getTime();
var y=t/years;
document.write("Tt's been: "+Math.floor(y)+" years since 1970/01/01!");*/
function startTime() {
	
var d=new Date();
var h=d.getHours();
var m=d.getMinutes();
var s=d.getSeconds();

//add a zero in front of numbers<10
/*m=checkTime(m);
s=checkTime(s);*/
if (m<10) {		
	m="0"+m;
}
if (s<10) {
	s="0"+s;
	
}

document.getElementById('txt').innerHTML=h+":"+m.toString()+":"+s.toString();
w=setTimeout('startTime()',1000)
}
/*function checkTime(i)
{
if (i<10) 
  {i="0" + i}
  return i
}
*/
var str="visit W3school";
var pattl=/W3school/;
	if (pattl.test(str)) {
	var result="验证通过";
	}
	else {
		var result="验证不通过";
	}
	document.write(result);


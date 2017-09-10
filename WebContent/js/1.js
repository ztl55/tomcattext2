/**
 * 
 */
document.write("<table border='1' width='200px' cellpadding='5'>");
for (var x = 1; x <=9; x++) {
	document.write("<tr>");

for (var y = 1; y <=x; y++) {
	document.write("<td>"+y+"*"+x+"="+y*x+"</td>")
	
}
document.write("</tr>")
}
document.write("</table>");

//动态函数
var add=new Function("x,y","var sum;sum=x*y;return sum;");
var sum=add(4,5);
document.write("sum="+sum);

//匿名函数
var add=function (x,y){
	return x+y;
	
}
var su=add(4, 5);
document.write("<br>"+"su="+su+"<br>");

//定义去掉两边空格的函数

	function mytrim(str) {
		var start=0;
		var end=str.length-1;
		while (start<=end && str.charAt(start)==" ") {
			start++;
			
		}
		while (start<=end && str.charAt(end)==" ") {
			end--;
			
		}
		return str.substring(start,end+1);
		
	}
	var str="  ss  w  "
		document.write("-"+str+"-<br>");
		document.write("-"+mytrim(str)+"-<br>");
		
//用join方法，把数组元素组成字符串
		function myjoin(su,type) {
			var result="";
			for (var x = 0; x < su.length; x++) {
				if (x!=su.length-1) {
					result+=arr[x]+type;
				}else {
					result+=arr[x];
				}
			}
			return result;
			document.write(result);
	
		}
		var add=["zhao","tian","lin"];
		document.write(add.join("-")+"<br>");
		document.write(add.pop());
		
//js date时间对象
		var date=new Date();
		document.write(date+"<br>");
		document.write(date.toLocaleString()+"<br>");
		document.write(date.toLocaleDateString()+"<br>");
		document.write(date.getDay()+"<br>")
		document.write(date.getFullYear()+"<br>")
		document.write(date.getHours()+"<br>");
		document.write(date.getMonth()+1+"<br>")
		document.write(date.getDate()+"<br>");
		

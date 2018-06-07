console.log("hello world!!");

var sum = function(a,b)
{
	return a+b;
}

function outerFn(){
	console.log('outer function')
	return function(){
    	console.log('inner function')
    }
}
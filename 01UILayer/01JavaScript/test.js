// console.log("hello world!!");

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

//Scopes

// 1. Creation Phase:
// outerFn [x: undefined, inner:undefined] , innerFn [x:undefined]
// 2. Execution Phase
// outerFn [x: 2, inner:fn] , innerFn [x:undefined]

function outerFn(){
    var x = 2
    console.log('outer function')
	var inner = function(){
        console.log(x+2)
        var x = 0
    	console.log('inner function')
    }
    return inner;
}

// outerFn()()
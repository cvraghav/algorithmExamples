
var binarySearch = (array,num) => {
	var min = 0;
	var max = array.length-1;
	while(min < max){
		var middle = Math.round((min+max)/2)-1;
		console.log('Min:  ',min, 'Max: ',max, 'Middle: ',middle, 'Num: ',num, 'Array: ', array[middle])
		if(array[middle] === num){
			return middle;
		} else if(num < array[middle]){
			console.log('Num is less')
			max = middle+1;
		}else{
			console.log('Num is bigger')
			
			min = middle-1;
		}
	}
	return -1;
		
}


const anotherSearch = (array,num) => {
//	console.log(array)
	return recursiveBinary(array, 0, array.length-1, num)
}

var recursiveBinary = (array, min, max, num) => {
	const middle = Math.round((max+min)/2)-1;
	console.log('Min:  ',min, 'Max: ',max, 'Middle: ',middle, 'Num: ',num, 'Array: ', array[middle])
	if(middle-min<=1){
		console.log('Could not find target', array[min], array[middle], array[max])
			return -1;
	}
	var i = min;
	var j = max;

	if(array[middle] === num){
		console.log('Met target')
		return middle;
	}else if(array[middle] > num)
		j = middle+1;
	else
		i = middle-1;

	return recursiveBinary(array, i, j, num)
}

var i=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97];

//var result = binarySearch(i, 69);
//console.log('Result: ', result)
console.log('\n\n')
var r = anotherSearch(i, 59);
console.log('New Search :', r)
console.log('\n')
r = anotherSearch(i, 69);
console.log('Another :', r)
console.log('\n')
r = anotherSearch(i, 96);
console.log('Another :', r)
console.log('\n')

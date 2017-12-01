
const bubbleSort = nums => {
	do{
		var swapped = false;

		for (var i=0; i< nums.length; i++){
			if(nums[i] > nums[i+1]){
				var temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
				swapped=true;
			
			}
		}

	}while(swapped)

	return nums;
}

const insertionSort = nums => {
	for (var i=1; i< nums.length; i++){
		for(var j=0; j<i; j++){
			if(nums[i] < nums[j]){
				let spliced = nums.splice(i, 1);
				nums.splice(j, 0, spliced[0]);
			}
		}
	}

	return nums;

}

const mergeSort = nums => {
	if(nums.length < 2) return nums;

	const length = nums.length;
	const middle = Math.floor(length/2);
	const left = nums.slice(0, middle);
	const right = nums.slice(middle)

	return merge(mergeSort(left), mergeSort(right));
}

var merge = (left, right) => {
	const results = []
	while(left.length && right.length){
		if(left[0] < right[0])
			results.push(left.shift())
		else
			results.push(right.shift())
	}
	return results.concat(left, right);
	
	
}

const quickSort = nums => {
	if(nums.length < 1) return nums;	
	let pivot = nums[nums.length-1];
	const left =[]
	const right = []

	for(var i=0; i< nums.length-1; i++){
		if(nums[i] < pivot)
			left.push(nums[i])
		else
			right.push(nums[i])
	}

	return [...quickSort(left), pivot, ...quickSort(right)]

}

var arr = [5, 3, 10, 4, 6, 1, 9, 2]
var results = bubbleSort(arr);
console.log(results);

arr = [5, 3, 10, 4, 6, 1, 9, 2]
results = insertionSort(arr);
console.log(results);

arr = [5, 3, 10, 4, 6, 1, 9, 2]
results = mergeSort(arr);
console.log(results);

arr = [5, 3, 10, 4, 6, 1, 9, 2]
results = quickSort(arr);
console.log(results)



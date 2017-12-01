
var bubble = nums => {
//	return nums;
	do{
		var swapped = false
		console.log(nums)
		for(var i=0; i< nums.length; i++){
			if(nums[i] > nums[i+1]){
				var temp = nums[i]
				nums[i] = nums[i+1]
				nums[i+1] = temp
				swapped=true
			}
		}
	}while(swapped)
	return nums;
}

var i = [10,5,3,8,2,6,4,7,9,1]
console.log(bubble(i))
var final = bubble(i)
console.log([ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ].equals(final))

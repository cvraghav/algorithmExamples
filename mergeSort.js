
const mergeSort = nums => {
 if(nums.length < 2) return nums;

 const length = nums.length;
 const middle = Math.floor(length/2)
 const left = nums.slice(0, middle)
 const right = nums.slice(middle)

 return merge(mergeSort(left), mergeSort(right))

}

const merge = (left, right) => {
 const results = []

 while(left.length && right.length){
  if(left[0] <= right[0])
   results.push(left.shift())
  else
   results.push(right.shift())
 }

 return results.concat(left, right)

}


var i = [10,5,3,8,2,6,4,7,9,1];
var results = mergeSort(i)
console.log('Final results :', results)

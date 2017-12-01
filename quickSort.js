
const quickSort = nums => {
 if(nums.length <= 1) return nums;
 console.log(nums)
 const pivot = nums[nums.length-1]
 const left = []
 const right = []

 for(let i=0; i<nums.length-1; i++){
  if(nums[i] < pivot)
   left.push(nums[i])
  else
   right.push(nums[i])
 }
 console.log('Left: ', left, ' Right: ', right)
 return [...quickSort(left), pivot, ...quickSort(right)]

}

var i = [10, 8, 2, 1, 6, 3, 9, 4, 7, 5];

var results = quickSort(i)
console.log('Final Result: ', results)


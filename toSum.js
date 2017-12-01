var twoSum = (nums, target) => {
 console.log(nums, ' ,' , target)
 const result = []
 for(let i=1; i<nums.length; i++){
  for(let j=0;j<i; j++){
   console.log(i, nums[i], j, nums[j])
   if(nums[i]+nums[j] === target) {
    result.concat(result.push(j), result.push(i))
    return result
   }  
  }
 } 

}

var i = [2, 7, 11, 15]
var result = twoSum(i, 18)
console.log(result)

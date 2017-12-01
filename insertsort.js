
var insertionsort = nums => {
console.log('NUms ', nums)	
 for(var i=1; i< nums.length; i++){
  for(var j=0; j<i; j++){
  // console.log(i,' ', j)
   if(nums[i]<nums[j]){
    let spliced = nums.splice(i, 1)
    nums.splice(j, 0, spliced[0])
    console.log(nums)
   }
  }
 }

}

var i = [10,5,3,8,2,6,4,7,9,1];
var result = insertionsort(i)
console.log(result)

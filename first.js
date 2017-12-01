console.log('Hello')

let wr = (msg='......') => console.log(`${msg}`)

function basicRecursion(max, current) {
	if(current > max) return
	wr(current)
	basicRecursion(max, current+1)
}
//wr() 
//wr(5)
//basicRecursion(5,1)

function fibonacci(number){
	if(number < 2) return 1;
	
	return fibonacci(number-1) + fibonacci(number-2); 
}

for(var i=0; i<20; i++)
	console.log(`${fibonacci(i)}`)


describe('fibonacci', function() {
	it('should print fibonacci series', () => {
		var nums = [1,1,2,3,5,8,13,21,34,55,89]
		nums.forEach((n) => {
			expect(fibonacci(n).toEqual(n))
		})
	});
})


# My learning for this solution

My first approach was to use a loop and then use a built-in method like replace() or replaceAll().  
That will solve the question faster. 

Then I realised that the interviewer wants to see my approach so I decided to solve it without using built-in method.

My approach was to use a loop then check for `.` is present on that particular index or not.  
If yes, then add `[.]`. If not then add that index to the string.

## Key Learnings

1. Use `final` whenever declaring a string whose value is not going to change
2. If you have to return string then use `toString()` 
3. `String` is immutable so try to use `StringBuffer` or `StringBuilder` if you want to change the string
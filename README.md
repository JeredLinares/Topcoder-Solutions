# Jered's Topcoder Challenges

Here you will find solutions to a variety of Topcoder problems. This is not meant to be novel, but instead one of many possible solutions to these excellent puzzles. It should be clearly stated that these were not my puzzles, but are published at regular intervals by http://topcoder.com as part of their competitive programming series. 

Table of Contents
- [Jered Linares](#Jered-Linares)
- [Programming Topics](Programming-Topics)
- [Runner](#Runner)
- [SRMs](#SRMs)
	- 730(#730)
	-- Div 2
	--- IntervalIntersections(#730-2-1)
- [Resume](#Resume)

## Jered Linares
Jered Linares 

[back to top](#Jered-Linares)

## Programming Topics

[back to top](#Programming-Topics)

## Runner 
The `Runner.java` file will load testing data from `[challenge]-d2-[problem].data` and test the class using this data.

[back to top](#Runner)

## SRMs
[back to top](#SRMs)

### 730 
This is the first challege that I am attempting to write up. 2/22/2018.
### IntervalIntersection
     10     public int minLength(int x1, int y1, int x2, int y2){
     11         int start, end;
     12         start = end = 0;
     13 
     14         if(x1 > y2){
     15             return x1-y2;
     16         } else if(y1 < x2){
     17             return x2-y1;
     18         } else {
     19             return 0;
     20         }
     21     }
     22 


## Resume 
[back to top](#Resume)

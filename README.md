# Topcoder Challenges

Here you will find solutions to a variety of Topcoder problems. This is not meant to be novel, but instead one of many possible solutions to these excellent puzzles. It should be clearly stated that these were not my puzzles, but are published at regular intervals by [Topcoder](http://topcoder.com) as part of their competitive programming series. 

Table of Contents
- [Jered Linares](#Jered-Linares)
- [Programming Topics](#Programming-Topics)
- [SRMs](#SRMs)
	- [Runner](#Runner)
	- [730](#730)
- [Resume](#resume)

## Jered Linares 
Jered Linares has trained in engineering, computer science, research, and medicine. He earned a B.S. from Illinois Institute of Technology (IIT) in Biomedical Engieering with a minor in Computer Science and went on to earn an M.D. from the University of Illinois at Chicago (UIC). He completed two years of internal medicine residency training at UIC and went on to an NIH T32 Fellowship. He now works as a research fellow and as founder of the startup P-Wave working in data science, machine learning and their application to bio-tech and health-tech. 

[back to top](#Jered-Linares)

## Programming Topics
Topics I plan to explore include....
- Obtaining genetic data
- Analyzing genetic data
- Vizualizing genetic data
- Vizualizing geo-coded data

[back to top](#Programming-Topics)

## SRMs
Single round matches are short programming competions which Topcoder hosts about twice a month. All problems completed here will be Division II. 

## Runner 
The `Runner.java` file will load testing data from `[challenge]-d2-[problem].data` and test the class using this data.
[back to top](#Runner)

### 730 
This is the first challege that I am attempting to write up. 2/22/2018.
### Problem 1: IntervalIntersection
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

[back to top](#SRMs)


## Resume 
[back to top](#topcoder-challenges)

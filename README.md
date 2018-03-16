# Topcoder Challenges

Here you will find solutions to a variety of Topcoder problems. This is not meant to be novel, but instead one of many possible solutions to these excellent puzzles. It should be clearly stated that these were not my puzzles, but are published at regular intervals by [Topcoder](http://topcoder.com) as part of their competitive programming series. 

Table of Contents
- [Jered Linares](#jered-linares)
- [Programming Topics](#programming-topics)
- [SRMs](#srms)
	- [Runner](#runner)
	- [730](#730)
- [Resume](#resume)

## Jered Linares 
Jered Linares has trained in engineering, computer science, research, and medicine. He earned a B.S. from Illinois Institute of Technology (IIT) in Biomedical Engieering with a minor in Computer Science and went on to earn an M.D. from the University of Illinois at Chicago (UIC). He completed two years of internal medicine residency training at UIC and went on to an NIH T32 Fellowship. He now works as a research fellow and as founder of the startup P-Wave working in data science, machine learning and their application to bio-tech and health-tech. 

[back to top](#topcoder-challenges)

## Programming Topics
Topics I plan to explore include....
- Data Vizulaization
-- ggplot2
- Obtaininig genetic data

[back to top](#topcoder-challenges)

## SRMs
Single round matches are short programming competions which Topcoder hosts about twice a month. All problems completed here will be Division II. 

## Runner 
The `Runner.java` file will load testing data from `[challenge]-d2-[problem].data` and test the class using this data.
[back to top](#topcoder-challenges)

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

[back to top](#topcoder-challenges)


## Resume 
Jered Diego Linares, M.D.
JeredL@gmail.com  |  708.307.0951 | 3804 S. 57th Ave. Cicero, IL 60804
Education: 
Medical Doctor: University of Illinois at Chicago, 2010 - 2014
Designed and implemented a longitudinal community based health intervention in Chicago
Investigated Pulmonary hypertension in Sickle Cell Disease
Elucidated the role of the Caldesmon protein in Pulmonary Hypertension
Served as treasurer of the Latino Medical Student Association
Bachelor of Science - Biomedical Engineering with minor in Computer Science, 2005 - 2010
Attained a certificate of Leadership Studies though the Leadership Academy
Held leadership positions in multiple organizations: 
 Latino Culture Group, Judicial Board, Biomedical Engineering Society, Sigma Phi Epsilon
Work Experience: 
National Institutes of Health (NIH) Fellowship at University of Illinois at Chicago, 2016 - Current
Designed, lead, and implemented an epidemiologic study of Atrial Fibrillation in Latinos
Evaluated the electrocardiographic changes induced by chronic kidney disease 
Generated a model for prediction of  stroke utilizing a genetic risk score
Utilized a RedCap database to create an atrial fibrillation registry for UIC Hospital
Internal Medicine Residency: University of Illinois Hospital and J.B. Veterans’ Hospital, 2014 - 2016
Performed direct patient care in all areas of Internal Medicine including: 
Outpatient, Inpatient, Critical Care Medicine, Pulmonology, Cardiology, Nephrology, Endocrinology, Oncology, Sickle Cell Disease, Gastroenterology, Infectious Disease
Led a clinical team in admission, diagnosis, and treatment of patients 
Engineering Intern, Baxter Healthcare - Global Infusion Systems, 2010-2010
Developed component requirement documentation for the Colleague Infusion Pump
Executed and documented Change Control Processes to complete medical device modifications
Regulatory Affairs Intern, Baxter Healthcare - Regulatory Affairs, 2009-2009
Evaluated safety and efficacy of Class II Medical Devices
Developed database system for medical device modification tracking
Coding Competitions: 
TopCoder: Harvard Medical School Challenge - “Minority Variants” 
Identified misread nucleotides vs. single nucleotide polymorphisms (SNPs)
Placed top 100 submissions worldwide
ProOnGo Mobile App Challenge
Designed and coded a new Iphone application for college admissions

Technical Skills: 
Modeling and Signal Analysis
Matlab
PowerLab / Power Chart
D-Chip: Microarray
DSI - Dataquest A.R.T

Programming/Scripting 
C  /  C++
Java SE
Javascript
Python
Bash
XHTML / XML / PHP / CSS

Statistical Packages
R / SAS / SPSS / STATA
Database Programs
MySQL
Microsoft Access

[back to top](#topcoder-challenges)

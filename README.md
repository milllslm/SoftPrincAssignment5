# SoftPrincAssignment5  
# Codename: Escalation Protocol

# Overview:
  My overall idea for this project is a texting based, escalation twist on the Piazza application. When this project was announced I quickly drew separate comparisons between the experts of our base app and the concept of Teaching Assistants and Professors. Throughout my academic career I have routinely heard professors complaining that kids ask them questions without previously consulting their peers and thus wasting the professor's time. In conjunction with this, I asked my friends and classmates (some of which were TAs) and got their feedback on the pros and cons of Piazza in their experiences. As a result I was able to craft the below questions to reaffirm the direction that I was already leaning as well as to refine my understanding of the needs and wants of my target audience.
  
  The below questions gave me some refined insight as well as some insight that I was previously ignorant of. The main thing that caught me offguard was the response of individual b regarding question 5. The response in question highlights that concerns about the honor code may be causing students to go straight to teachers rather than asking their classmates. This definitely is something I would need to take into consideration in the production stage of this application, either by sensoring the responses of classmates somehow or by allowing the teacher to see all questions and answers regardless of whether they were asked to them yet or not. Other than that, the responses mostly aligned with what I already supposed: students often ask questions that may have been easily answered by a classmate, relying on a computer for Piazza was a hassle, and that texting/push notifications were the best way to ensure a student recieves a message from someone.
  
  As a result, I have decided to build a Piazza-inspired messaging app for question-answer class questions that uses an escalation method. In borrowing from the storage structure of our base application, there will be classmates: TAs: and Professor(s): rather than the experts: map. When a classmate poses a question, it is sent to everyone on the classmates list (the asker included). Anyone in the class may submit an answer to the question, the answer will only be sent to the person who asked it. Submitting a question will also trigger a timer (as of right now I'm thinking 10 minutes), afterwhich the question will be escalated if no answer has been submitted. At this point the question will be sent out to the TAs of the class. This timer will once again run for 10 minutes, and if no answer is provided the Professor(s) will recieve a text with the question. If this still does not resolve the question in 10 minutes then the application will merely return the wikipedia page for the topic of the question.
  ***Disclaimer: After speaking to Professor White, he advised that an abridged version be done for this project initially as we do not have much time to code it, so maybe just one level of escalation or just the wikipedia return after the timeout***
  
  
# Questions:
  1. Have you ever been a TA for a class?
  2. Have you ever asked a TA a question and in retrospect thought it was a 'stupid question'?
  3. If you have been a TA, have you ever been asked a question that could have easily been answered by one of their classmates?
  4. Have you ever asked a Professor a question and in retrospect thought it was a stupid question?
  5. Why do you (or why do you think that others) choose to ask the Professor before consulting their fellow classmates?
  6. Have you ever had a class that used Piazza?
  7. Did you find Piazza overall beneficial for that class?
  8. What was the biggest drawback of Piazza?
  9. Did you know there was a Piazza phone app?
  10. What's the most efficent/convenient form of communication for you as a college student?
  
  # Answers: (a,b, and c denote the three individuals interviewed consistently)

## Question 1: 
a. No

b. Yes, CS 4288

c. No

## Question 2:
a. Pretty much every time yeah

b. A couple of times

c. Oh yeah

## Question 3: 
a. Never been a TA

b. Most questions kids ask

c. Never been one

## Question 4: 
a. Definitely

b. Happens every once in a while

c. Yeah, fairly often

## Question 5: 
a. I mean I personally just kind of panic and go straight to the professor because I get overwhelmed and assume they can help.

b. Could have something to do with the honor code but honestly its probably kids getting freaked out because they are confused.

c. I just figure they will always have the answer and I don't really count on my classmates knowing it

## Question 6: 
a. Yeah, 1101

b. Duh I'm a CS major

c. Just the Java class

## Question 7: 
a. Yeah I looked at it on most assignments

b. Sometimes it is if other people have questions before you even start the assignment

c. Yeah I asked a couple of questions on there

## Question 8: 
a. I had to log onto my computer to check it which stunk

b. I get those activity digest emails like once a day and they are so annoying at this point

c. I only really got notified when my specific question was answered, had to go online to see the other questions

## Question 9: 
a. Uh no

b. Yeah but I don't really need it at this point I'm a senior

c. Nope wish I had

## Question 10: 
a. Groupme or texting

b. Anything I can get on my phone

c. Probably texting or any app on my phone that has notifications like facebook messenger 

# Requirements
Each requirement will be listed as (a), will be accompanied by a (b) that rationalizes the need for the requirement, and will be followed by a quick synopsis (c) of the proposed way in which the application will fullfill that requirement.

1.
  a. A text based application
  b. Not only is this a requirement from the Professor, but it also directly emphathizes with users as seen in their responses to question 10 where they note that text messaging/phone communication is the most convenient and reliable mode of communication for them.
  c. This will be accomplished using the twilio accounts from assignment 4 in conjunction with the base code that we already have from assignments 1-3, which correctly parses and handles incoming text messages of the correct format with the correct side effects.
2.
  a. Ensure that questions are first sent to classmates before resorting to alternatives for answers
  b. As noted by the interviewee that was a TA (and by prior discussions with teachers and Professors from my past), a major annoyance is that students tend to ask questions to people far above the required heirarchical level needed for a sufficient response.
  c. As noted in the overview, this will be accomplished by some sort of escalation protocol. For the full scale proposed application, this would take the form of classmates->TAs->Professors-> wikipedia escalation via a timer; however, for the 'stub' needed for demo purposes this may just take the form of one level of escalation (either from classmates->TA or classmates->wikipedia) via the same timer mechanism.
3. 
  a. Ensure that set up for users is not lengthy or cumbersome.
  b. The point of this application is to make an easier, more accessible version of a Piazza-esque system. Thus, not only should the messages be easily accessible for users (by texting it directly to them), but the set up should be as easy or easier than downloading an app on one's phone.
  c. This will be done by adapting the 'add expert' functionality of the preexisting base code. In doing so set up for any individual (classmate, TA, or Professor) will be as easy as texting 'add <classmate, TA, or Professor>' to the appropriate phone number for the twilio bot.
4.
  a. For the full scale application, some sort of tangible response must be generated within a manageable timespan (~30 minutes)
  b. As seen in the 'panic' noted in responses to Question 5, students are high stress individual. As a student myself, I know how disheartening and frightening it can be to have a question go unanswered for a long time (when you email a professor and they don't respond for a day). Thus, the application should give some sort of comforting (as comforting as a wikipedia page may be) response in 30 minutes or less.
  c. This will be accomplished via the timeouts and escalation progression that was previously stated for the full scale application. By the time 30 minutes has passed, if no answer has been submitted, the question will have been asked to classmates, TAs, and Professors, and at the very least the bot will return the wikipedia page for the submitted topic.


# Development Approach
In an attempt to be as thorough as possible, I will include in this development approach the development of the parts of the application that are already done (the base functions and the handlemsg functionality as well as the memstore, plus having a twilio account for testing purposes).

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
In an attempt to be as thorough as possible, I will include in this development approach the development of the parts of the application that are already done (the base functions and the handlemsg functionality as well as the memstore, plus having a twilio account for testing purposes). The approach highlights the broad steps as well as their specific subparts.

## Requirements Gathering
1. Brainstorm a target population or a problem to tackle and identify the population that would benefit from a solution to that problem.

2. Identify questions that will help clarify the problem in question as well as proposed solution-elements from population members.

3. Collect answers to these questions from a sample of the population, understand their view of the problem and the key components that need to be addressed. These components become your requirements as seen in the above section.

4. Identify a solution to this problem that seems consistent with your engineering capabilites and the timeframe in which you have to work.

***From here on out the understanding is that the above steps were followed and that the decision was to pursue the concept identified in the overview section*** 

## Architecture Design/Brainstorming
At this stage you need to identify the architecture of the system you want to design. While brainstorming the architecture you should consider the inputs, outputs, and thus the the flow that your code should take to get from one to the other.

### Code Flow
The inputs to this problem will be a text message from a given user. Given that we already have the structure from assignments 1-3, it seems most practical to maintain the input structure from the existing codebase. Thus the input is a message from a given user (unique ID by phone number) in the format of a parsed message. This parsed message will have a <cmd> as the first word in the message. What follows will be the args. Depending on the command there may be 0 args, 1 arg, or multiple - in which case the second space-deliniated word would become the <topic>.
  
The outputs to this problem will also be text messages. Depending on the command that was input, the output message may be simply confirming that their command was succssfully received, but may also be a response to a user's question from another user. In order to actually send the output of our clojure code to the users it needs to go to (whether that is sending a question to everyone it needs to or sending the answer from one user to the asker) we will need some sort of function to interact with the twilio api. Thus we will need a action-send-msgs function to communicate with the conveniently supplied code to interact with twilio.

Given this input and output, we can now address the black box in the middle. Since our input relies primarily on the first word of the message, there will need to be some sort of router function to redirect the rest of the of the message to the appropriate function handler based on what the <cmd> is. Say hello to create-router in handle-message. So now given an input message we can correctly forward everything after the first word to the appropriate handler.
  
Now what sort of commands do we want the user to be able to invoke?

1. As per requirement #3, users need to be able to easily add themselves to the group that they belong to. So we will need a function that adds a given user to the list of members of the group of their choice. Thus we will have an **add-classmate**, a **add-TA**, and a **add-Prof** function (for the full application). *Ideally only TAs and Professors respectively would have access to their respective functions but that authority task is beyond the scope of this assignment*

2. As per the nature of the application, classmates need to be able to pose a question to the class. Thus we will need a function handler that takes the rest of the words in the message, and asks a question for a given topic. Since there are three groups of people that we may need to ask one of four groups of people/wikipedia we will need a **ask-classmates**, a **ask-TAs**, a **ask-professors**, and a **ask-wiki** function. Notice that with this application as opposed to assignment 1-3, the topic is not necessary at this point for selecting experts on a given topic. Regardless of the topic the escalation of the question and the recipients of the question will be the same - topic is only important for the ask-wiki function. For the other three functions, the topic will merely serve as subject-line-esque component.
  
3. Naturally, if a user asks a question another user will need to be able to answer that question. Thus there will be a universal **answer-question** function that allows a user to answer the most recent question that they have been asked. One clear limitation in this implementation is that only the most recent question will be answered, any older unanswered questions will be overwritten. Given more time for implementation this would be the first thing I would choose to address; however, given the time span that we have I do not believe I will be able to fix this in time.

Notice that both add and ask have 3-4 named variations of basically the same function. In order to consolidate this, a good idea would be a generic wrapper **ask** and **add** function that each take a first parameter <target-group> as their first parameter and will conduct the branching there to the appropriate specific function.
  
Also, although it was not explicitly stated above, it should be understood that each of the functions will do their respective error checking. Add will check that the <target-group> is a valid one, ask will verify the <target-group> and assure that there is both a topic and a remaining question after it, and answer will verify that a non-empty answer is returned as well as verifying that a question has been asked.
  
Lastly, we will want to acknowledge that the system has received a given message and is acting on it. Thus our router/handler complex will need to not only execute the right set of functions as side-effects, but will not to also return some sort of message immediately to the sender of a command. Thus the return of any of the above functions needs to be two-fold, with both a response string as well as the actions that need to be subsequently taken by the system.

In conclusion: Input text message -> router -> appropriate function based on <cmd> -> function executes with params -> response string & actions resulting from the command (actions may trigger subsequent functions).

### Structural and Data Type Considerations
Given the above codeflow we need to make some decisions about how we will represent various components as to be the most efficient, reusable, and extensible.

1. Input message: since the input message is predictably broken apart, we can do this as a first step. This parsed-msg will have some predictable components - the <cmd> and the <args>. However, we may want to add other useful information to an incoming message such as the uniqueId of the user or we may want to extract the <topic> from the <args> for certain functions. So we need a flexible data type that can take advantage of keywords. Thus the best approach would be to store the parsed-msgs as a map of key value pairs using keywords.
  
2. Storing the state of the system: this is a big one. The system as a whole has many interrelated moving parts and will thus need some sort of global state that is shared/available to various parts of the application at any given time. Given the immutability of clojure this is a larger task than it may originally seem. We need to keep track of the members of each of the 3 groups as well as the questions that have been asked of every single individual (so that they may ask them). Furthermore, we need a way to check if a given question has been answered within the time frame of its timer (10 minutes).

Conveniently we have access to a clojure protocol for keyValue stores. The included functionality includes get, put, remove, and list. For our purposes we will need to use the also-provided memStore type that follows this protocol. This memStore merely acts like a global storage system, using a high-level map to sort information. In our application we will need to store our groups as well as the conversations and questions for each user. Using a map-based store this should be simple, denoting :classmates, :TAs, :Professors, :questions and :conversations as their own top level keys in the map. 

For each of the groups we do not need to store anything except for the identifier for an individual, so we merely store a list of the phoneNumbers of members of a given group as the value for a given top-level group key.

For the conversation, we need to keep track of the most recent question any given user has been asked. However, we also need to know who asked the question. Thus the top level :conversation key will map to another map, where the key is any individual's uniqueId (phone number) and the value will be the question itself and the uniqueId of who asked it - so that the response can be sent to the correct individual.

For the questions, we need to keep track of whether a given user's most recent question has been answered so that when the timer goes off we can either do nothing or escalate the question (or return the wikipedia link for the prototype). To do this the :questions key should map to another map where the key is a given userId and the value another map consisting of :topic and :status. :topic will hold the topic in the event that wikipedia is necessary, whereas :status is either "open" or "closed" in respect to the question that the individual asked. When a question is asked this state will be stored as opened, and when a user answers a question this will also go update the field for the askee's question to "closed". When the timer goes off from a given question, this will trigger a check of a given userIds key under :questions. If the value is "closed" then nothing happens. If the value is "open" then the question should be escalated (or in the case of the demo, the wikipedia page for the topic should be returned to the user).

### Estimations
Now that we've identified the moving pieces and what our data structures might look like, lets take a look back at how long this might take. I will break this up into milestones to aid in the estimation

1. Building the core handle-msg functionality for a simple one-group population, with add, ask, and answer enabled for that one group: understanding and building the base of an application can be time consuming and given my relative unfamiliarity with clojure at the start of this, I would estimate **2-3 weeks** of effort for this part. Lucky for us this part is already done.

2. Modifying the above system to have a state-manager that supports the :questions field and up to 3 different groups of individuals, each of which have the ability to add themselves to a group and answer questions - and at least the first group has the ability to answer them: Given that I should have a good understanding of the storage system and the core functionality of the code generated in step 1, this part should not take too long to generate. I would estimate that **10-12 hours** of effort may be required as unforseen conflicts are likely to occur.

3. Adding a timer componenent that triggers a callback of some sort, starting by just triggering the ask-wiki function if the timer occurs before a given question has been answered. This one is a tad tricky as it depends on the performance of timers in clojure. A quick google search shows that setting a timer is possible; however, it is not immediately clear how this asynchronous timer approach will work within the preexisting code. Such uncertainty should be treated with cautious estimation and thus I will estimate a wide range of **10-15 hours** for this component.

4. Extending the above step to include escalation from classmates-> TAs -> Professors -> wikipedia: while it seems like this may just be a case of successive iteration on step 3, there are likely to arise conflicts with the timers and the multiple stages of escalation. Thus I would estimate another **10-12 hours** of effort for this componenet.

In total, from start to finish this project could take up to 4-5 weeks. Given that we already have step 1 in place, I would estimate that the prototype version will take a week and a half while the full version would take up to 3 weeks of consistent work to implement.

## Core Component Implementation
As the codeflow and data structures sections lay out the step by step desired architecture I will not dwell on that here. Here I will focus on the order in which these steps should be undertaken.

1. Establish helper functions for parsing and sending messages to ease the larger functions.

2.1. Set up the stores so that the functions you make have something to test against.

2.2. Set up the handle-msg function and the router to cause the correct functions to be executed using the global state, and to easily view the return of these functions (makes testing much much easier). 

3. Write the add method. None of the others can be tested without a working add method.

4. Write the ask method and then try to exract components from your store to see if the questions are being appropriately stored in the various spots they should be appearing.

5. Write the answer method, making sure that the conversation store works in conjunction with this to reply to the correct person.

6. Write the ask-wiki method to merely return a url based on the :topic of the parsed-msg.

7. Add in the timer to print out some random message (make sure the way you are using the timer is valid).

8. Cause the timer to trigger a function that takes in the userId of the asker and thus checks the asker's uniqueId within the :questions cache to see if :status is open or closed.

9. If :status above was open, now trigger ask-wiki and close the question status.

The rest is beyond the scope of the demo stub

10. Now alter the timer to escalate the issue to the next level if the question status was open, rather than immediately triggering ask-wiki.

## Integration With External Service

### AWS Setup
Follow the class instructions for getting set up with a class-grouped AWS account, or make your own by going to the AWS website.
In AWS go to IAM and create a new user, giving them Administrator permissions and recording their access key as well as their secret. Set these in the appropriate environment variables (google it if you don't know how).

### Twilio Setup
The below steps are directly from Professor Whites instructions on assignment 4.

1.Install the Serverless framework and all dependencies (NodeJs, etc.): https://serverless.com/framework/docs/providers/aws/guide/installation/

2. Verify that the "sls" command is on your path and add it if it is not

3. Run the command "lein deps" at the root of your project

4. Create a Twilio account and enable 2-factor auth

5. Go to Twilio and buy an SMS-enabled phone number with a 615 area code and write down the number.

6. Go to Twilio settings and write down your live and test credentials

7. Run the command "lein deps" in this project

8. Create secure secrets for your Twilio credentials in AWS

9. Verify that you did everything correctly by running this command in the root of the project:
sls secrets validate

10. Run "sls deploy" in the root directory

11. Copy the endpoint URL for POST

12. Create a "deploy.edn" file in the root folder of the project

13. Insert a raw Clojure map in the file with keys for your endpoint and phone number like this (replace these dummy values with yours!):
{:endpoint "https://abcxyz.execute-api.us-east-1.amazonaws.com/dev/msg"
 :phone-number "+1615xxxxxxx"}



### Clojure on Twilio
This is a big ? for me I don't fully understand this part yet

## Testing
Automated testing is not likely to be achieved within the time span of this assignment, so we will have to rely on live testing and hands on tests.

### Stepwise Testing
Firstly, each step under "Core Component Implementation" should be followed by a self test by the developer wherein they use the REPL to mock a given store and test that certain functions (in conjunction with the router and handle-msg) have the desired effect on the store. 

Next, every step up through step 5 is conveniently tested within the test framework of assignment 3. So simply code against lein test-refresh to check your progress up through this point.

After this you will need to check the output of the handle-msg function to see if the actions have triggered the desired effects. For the timers you will need to simply wait (may want to set the timer to a much lower time limit for testing purposes) before printing something indicative to the console output.

To test the twilio integration you will need to switch the environment in handle-msg from test so that text messages are actually sent.

### Trial Classroom
When you think you have a final working version of this application (or at least the prototype), it is strongly advised that you test this with a sample group of people to mimic a classroom setting. A couple of runs of this should identify errors in implementation or, at the very least, what might be the best next steps for future iterations of this project.

## Deployment
???????????? need to figure out how exactly this works with deploying the clojure code to work with twilio.

## Demo Stub
As noted throughout this document the scope of this idea is very large relative to the time we have to engineer it. Thus I will take this time to outline the capability that is being aimed for for the stubbed version needed for the demo date:

- A text based app aimed at a specific classroom of students
- Classmates, TAs, and Professors can all self-add via their respective functions as highlighted above
- When a question is asked by a classmate, it will be texted to the rest of the class
- Any member of the class that is texted a question may reply
- If no reply is given in 10 minutes then a link to the wikipedia page for a given topic will be returned instead
- No user should ask a new question before their previous question has been answered for the timer to work



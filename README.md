# Rosie <img src="https://github.com/chrisngyn/chrisngyn/blob/master/Hi.gif" width="35px">

## About
Rosie is a [Discord](https://discord.com) bot with ~20 features that serves as a centralized platform to perform many actions in one place - so long ago are the days where we had to open many Google Chrome tabs to do what we wanted.
    
Here's a short demo some of Rosie's features:
<p align="center"><img src="https://github.com/chrisngyn/Rosie/blob/master/media/rosie.gif" width="80%"></p>

## Commands

### HELP
+ **!ping** - tests to see if Rosie is up and running. Responds with "Pong!" if so.
+ **!help** - responds with all features and documentation on how to use each command.
+ **!serverinvite** - generates an invitation link to the server that expires in 10 minutes.
+ **!botinvite** - generates a link to invite Rosie to more Discord servers.

### ARITHMETIC
+ **!calculate** [number1] [+, -, *, /, %, ^] [number2] - computes basic math.
+ **!moremath quadratic** [number1] [number2] [number3] - quadratic formula; enter values to get the roots of an equation.
+ **!moremath pythagorean** [number1] [number2] - pythagorean theorem; enter two side lengths to get the hypotenuse. 
+ **!moremath** [sin, cos, tan, c2f, f2c] [number] - computes more math operations; C2F and F2C are Celsius to Fahrenheit and Fahrenheit to Celsius respectively.

### RANDOM RESPONSES
+ **!random coin** - flip a coin.
+ **!random dice** - roll a die.
+ **!random card** - draw a card.
+ **!random choose** option1 | option2 | option3 | ... - choose an option.
+ **!random between** [number1] [number2] - get a number in that range (inclusive).
+ **!8ball [anything]** - get a random Magic 8-Ball response!

### REMIND ME
+ **!remindme** [number] [s, seconds, m, minutes, h, hours] [reminder] - set a reminder; Rosie will send you a direct message reminding you when time is up.

### REDDIT
+ **!reddit** [name of subreddit] - responds with the top five current hottest posts of a subreddit.  

### GOOGLE SEARCH
+ **!googlesearch** [query] - responds with the top three links to come up in Google.  

### TO DO LIST (supports basic CRUD features)
+ **!todo add** [query] - add an entry to your todo list.
+ **!todo view** - view your current todo list.
+ **!todo complete** [existing entry] - mark an entry as completed.
+ **!todo remove** [existing entry] - delete an entry from your to do list.

## Configuration
1. Go to `.env-sample`, provide the following keys, and rename file to `.env`:  
  
    [Get your Discord token](https://discord.com/developers/applications)  
    `DISCORD_TOKEN=replace_me`  
      
    [Get your Reddit keys](https://www.reddit.com/prefs/apps)  
    `REDDIT_USER=replace_me`  
    `REDDIT_PW=replace_me`  
    `REDDIT_PUBLIC_KEY=replace_me`  
    `REDDIT_PRIVATE_KEY=replace_me`  
      
    [Get your Google Custom Search Engine (CSE) keys](https://developers.google.com/custom-search/v1/introduction)  
    `GCSE_ENGINE_ID=replace_me`  
    `GCSE_API_KEY=replace_me`  
      
    [Install MySQL](https://dev.mysql.com/downloads/installer/)  
    `MYSQL_URL=replace_me`  
    `MYSQL_USER=replace_me`  
    `MYSQL_PW=replace_me`

2. Go to `docker-compose-sample.yml`, replace lines 11 and 12 with your respective DB name and password, and rename file to `docker-compose.yml`

3. `docker build -t rosiebot .`

4. `docker-compose up -d`

## Future Improvements / Roadmap
1. Need to add a lot more error handling.

2. More features (currently looking into incorporating Google Calendar, money conversion, and tweet grabbing commands).

3. Cleaning up the codebase significantly - namely abstracting a lot of the code in various commands to helper functions / separate files, for example in the `ToDoList.java` command, having a separation of concern for the database connection logic.

## Miscellaneous
1. If you ever need to recompile the `.jar` file

      `mvn package`
      
(Two `.jar` files will be generated in the `target/` directory - rename the one with dependencies to `rosie.jar` and move it to the root directory)

2. Pull requests are always welcomed :)

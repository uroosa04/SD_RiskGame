[![Build Status](https://travis-ci.com/uroosa04/SD_RiskGame.svg?branch=master)](https://travis-ci.com/uroosa04/SD_RiskGame) 
[![codecov](https://codecov.io/gh/uroosa04/SD_RiskGame/branch/master/graph/badge.svg)](https://codecov.io/gh/uroosa04/SD_RiskGame)

# Project SD_RiskGame

## About: Software Design project to implement the board game Risk.

### V0.3
-Users can undo their actions
-Program uses Amazon S3 to replay games

### V0.4
-Notify players if their territories are under attack. (Remember the Observer Pattern)
-Players can purchase in-game credit. They can use the credit to buy cards, buy undo actions, or transfer the credits to another player.
-Post the number of territories conquered by each player on Twitter after each turn and at the end of the game. 
-Modify pom.xml to generate JavaDocs and class diagrams.

### V0.5
-Timeout: A player has only 30 seconds to take an action, otherwise the game moves on to the next player
-Telegram Chatbot: Players can play using a Chatbot. At first, player identifies the game session that it wants to play by entering a gameId. A game starts when all players have joined the game. -Assume that the number of players in this case is always 3.

### Final
-Increase the line coverage of the test cases to at least 80% 
-Refactor, refactor, refactor: Ask yourself:  can you implement classes with fewer fields? Can the number of method arguments be smaller? Have you designed any Exception specific to your project (e.g. InvalidMoveExeption)?


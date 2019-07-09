# Bowling Game scoring application to find the score based on the input

This repo have the source code for Bowling Game Score finding logic. Its designed as a spring boot appliction and hosted the logic as a REST GET Service

## Game Logic

* Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
* In each frame, the bowler gets up to two tries to knock down all the pins.
* If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
* If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
* If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
* If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.

The game score is the total of all frame scores.

More info on the rules at : http://www.topendsports.com/sport/tenpin/scoring.htm

## Test Cases

(When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss)

 * X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300
 * 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90
 * 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150

## Assumptions

* We will not check for valid rolls.
* We will not check for correct number of rolls and frames.
* We will not provide scores for intermediate frames.
* if X5/ found then as spare next to strike considered 10 as a score for spare frame

## How to use the application

### Set up

* Minimum JDK Version - 7.0
* Minimum Maven Version - 3.5.0

1. git clone https://github.com/2019-Q2_SOW_DEV_033/bowling-game.git
2. cd bowling-game
3. mvn spring-boot:run

### Use Case/ How to Test

1. open url http://localhost:8080/bowling-game/score?line=XXXXXXXXXXXX in any browser
2. In the value of line field above type the input you want to get the score 
    1. As Example above X as a strike, / as a spare and - as miss
    2. Maxmimum 20 values plus 2 values as bonus
    3. More Help found in the page bowlinggenius https://www.bowlinggenius.com/
3. Enjoy



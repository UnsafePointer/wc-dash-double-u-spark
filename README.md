# `wc -w`: Word counter Spark application

## Building

```shell
% ./gradlew build                                                             

BUILD SUCCESSFUL in 7s
8 actionable tasks: 8 executed
```
## Usage

```shell
% ./gradlew -q run            
Number of unique words: 20325
Most common words: the (34577), and (22147), to (16713), of (14994), a (10494)

% ./gradlew -q run --args="-h"                                                 
Usage: word-counter options_list
Options: 
    --bookUrl, -u [https://www.gutenberg.org/files/2600/2600-0.txt] -> Text file URL { String }
    --verbose, -v [false] -> Verbose mode, display Spark logs 
    --help, -h -> Usage info 
    
% ./gradlew -q run --args="-u https://www.gutenberg.org/cache/epub/30/pg30.txt"
Number of unique words: 13031
Most common words: the (64128), and (51765), of (34750), to (13649), that (12927)   
```

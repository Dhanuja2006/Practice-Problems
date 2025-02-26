/*
Range -> 00:00 to 23:59
hr -> 00 - 23
min -> 00 - 59

hr:
?? -> 23
?x -> x <= 3 -> (? = 2)
?x -> x > 3 -> (? = 1)

min:
?? -> 59
?x -> (? = 5)
x? -> (? = 9)
*/

char* maximumTime(char* time) {
    if(time[0] == '?'){
        if(time[1] == '?'){
            time[0] = '2';
            time[1] = '3';
        }else if(time[1] <= '3'){
            time[0] = '2';
        }else if(time[1] > '3'){
            time[0] = '1';
        }
    }
    if(time[1] == '?'){
        if(time[0] == '2'){
            time[1] = '3';
        }else{
            time[1] = '9';
        }
    }
    if(time[3] == '?'){
        time[3] = '5';
    }
    if(time[4] == '?'){
        time[4] = '9';
    }
    return time;
}

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "task.h"
#include "cpu.h" 
#include "schedulers.h"

#define SIZE 100

static int i=0;
Task task[SIZE];
//them 1 task vao danh sach
void add(char *name, int priority, int arrival, int burst) {
    task[i].name = name;
    task[i].burst = burst;
    task[i].arrival = arrival;
    i++;
}

//gọi scheduler
void schedule() {
    int j=0;
    int time = 0;
    for(j=0; j<il j++) {
        for(int k = j+1; k<i; k++) {
            if(task[j].arrival > task[k].arrival) {
                task temp = task[j];
                task[j] = task[k];
                task[k] = temp;
            }
        }
    }
    for(j=0; j<i; j++) {
        run(&task[j],time,task[k],burst);
        time +=task[j].burst;
    }

    
}
package com.joncolier.taskmanager;

import android.app.Application;
import com.joncolier.taskmanager.tasks.Task;
import java.util.ArrayList;

public class TaskManagerApplication extends Application {

    private ArrayList<Task> currentTasks;

    @Override
    public void onCreate() {
        super.onCreate();
        if(null== currentTasks){
            currentTasks = new ArrayList<Task>();
        }
    }

    public void setCurrentTasks(ArrayList<Task> currentTasks){
        this.currentTasks = currentTasks;
    }

    public ArrayList<Task> getCurrentTasks(){
        return currentTasks;
    }

    public void addTask(Task t){
        assert (null != t);
        currentTasks.add(t);
        }
    }


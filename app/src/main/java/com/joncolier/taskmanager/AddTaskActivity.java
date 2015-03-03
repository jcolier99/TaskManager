package com.joncolier.taskmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.joncolier.taskmanager.tasks.Task;

public class AddTaskActivity extends TaskManagerActivity {

    private EditText taskNameEditText;
    private Button addButton;
    private Button cancelButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_tasks);
        setUpViews();
    }

    protected void addTask() {
        String taskName = taskNameEditText.getText().toString();
        Task t = new Task(taskName);
        getTaskManagerApplication().addTask(t);
        finish();
    }

    private void cancel() {
        finish();
    }

    private void setUpViews() {
        taskNameEditText = (EditText)findViewById(R.id.task_name);
        addButton = (Button)findViewById(R.id.add_button);
        cancelButton = (Button)findViewById(R.id.cancel_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cancel();
            }
        });
    }

}

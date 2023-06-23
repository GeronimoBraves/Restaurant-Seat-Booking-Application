package com.example.sfc2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Menu2
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Button button1 = findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu2.this, Branches.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.button8);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu2.this, About2.class);
                startActivity(intent);
            }
        });

        RecyclerView
                ParentRecyclerViewItem
                = findViewById(
                R.id.parent_recyclerview);

        // Initialise the Linear layout manager
        LinearLayoutManager
                layoutManager
                = new LinearLayoutManager(
                Menu2.this);

        // Pass the arguments
        // to the parentItemAdapter.
        // These arguments are passed
        // using a method ParentItemList()
        ParentItemAdapter
                parentItemAdapter
                = new ParentItemAdapter(
                ParentItemList());

        // Set the layout manager
        // and adapter for items
        // of the parent recyclerview
        ParentRecyclerViewItem
                .setAdapter(parentItemAdapter);
        ParentRecyclerViewItem
                .setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList
                = new ArrayList<>();

        ParentItem item
                = new ParentItem(
                "Title 1",
                ChildItemList());
        itemList.add(item);
        ParentItem item1
                = new ParentItem(
                "Title 2",
                ChildItemList());
        itemList.add(item1);
        ParentItem item2
                = new ParentItem(
                "Title 3",
                ChildItemList());
        itemList.add(item2);
        ParentItem item3
                = new ParentItem(
                "Title 4",
                ChildItemList());
        itemList.add(item3);

        return itemList;
    }

    // Method to pass the arguments
    // for the elements
    // of child RecyclerView
    private List<ChildItem> ChildItemList()
    {
        List<ChildItem> ChildItemList
                = new ArrayList<>();

        ChildItemList.add(new ChildItem("Card 1"));
        ChildItemList.add(new ChildItem("Card 2"));
        ChildItemList.add(new ChildItem("Card 3"));
        ChildItemList.add(new ChildItem("Card 4"));

        return ChildItemList;
    }

}

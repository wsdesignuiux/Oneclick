package com.ws.design.oneclick.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ws.design.oneclick.Adapter.ProductAdapter;
import com.ws.design.oneclick.ModelClass.Product;
import com.ws.design.oneclick.R;

import java.util.ArrayList;
import java.util.List;


public class TabOne extends Fragment {
    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab1, container, false);


//        Recyclerview code is here

        productList = new ArrayList<>();
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "How to Use the Pen Tool\n" +
                                "in Adobe illusrator",
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use",
                        "By John Doe",
                        "Hour",
                        R.drawable.illustrator));

        productList.add(
                new Product(
                        1,
                        "How to Use photoshop's\n" +
                                "in Adobe illusrator",
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use",
                        "By John Doe",
                        "Hour",

                        R.drawable.adobephotoshop));

        productList.add(
                new Product(
                        1,
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use",
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use",
                        "By John Doe",
                        "Hour",
                        R.drawable.illustrator));

        productList.add(
                new Product(
                        1,
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use",
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use",
                        "By John Doe",
                        "Hour",
                        R.drawable.illustrator));

        productList.add(
                new Product(
                        1,
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use",
                        "The pen tool is without\n",
                        "By John Doe",
                        "Hour",
                        R.drawable.illustrator));

        productList.add(
                new Product(
                        1,
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use",
                        "The pen tool is without\n" +
                                "doubt one of the trickest\n" +
                                "tools to use" +
                                "The pen tool is without\n" +
                                "\" +\n" +
                                "                                \"doubt one of the trickest\\n\" +\n" +
                                "                                \"tools to use",
                        "By John Doe",
                        "Hour",
                        R.drawable.illustrator));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(getActivity(), productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return view;
    }
}



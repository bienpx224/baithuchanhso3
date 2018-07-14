package com.example.admin.baithuhanhanhso3.Adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.baithuhanhanhso3.Model.Contact;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact>{

    private Context context;
    private int resource;
    private List<Contact> arrayContact;

    public ContactAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrayContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){

        }
        return convertView;
    }

    public class ViewHolder(){
        ImageView imgAvatar;
        TextView tvName;
        TextView tvNumber;

    }
}

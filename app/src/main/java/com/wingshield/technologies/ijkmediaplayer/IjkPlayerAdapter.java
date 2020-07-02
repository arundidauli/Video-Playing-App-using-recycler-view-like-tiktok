package com.wingshield.technologies.ijkmediaplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.dl7.player.media.IjkPlayerView;

import java.util.List;


public class IjkPlayerAdapter extends RecyclerView.Adapter<IjkPlayerAdapter.MyViewHolder> {
    private static String TAG = IjkPlayerAdapter.class.getSimpleName();
    private Context context;
    private List<UserClips> userClipsList;
    public IjkPlayerAdapter(Context context, List<UserClips> userClipsList) {
        this.context = context;
        this.userClipsList = userClipsList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ijk_item_row_video, parent, false);



        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        // holder.videoPlayerWidget.autoStartPlay("http://ia800208.us.archive.org/4/items/Popeye_forPresident/Popeye_forPresident_512kb.mp4", MxVideoPlayer.SCREEN_WINDOW_FULLSCREEN, "");

        Glide.with(context).load("https://i.ibb.co/h2pBsP5/aadhar.png").fitCenter().into(holder.ijkPlayerView.mPlayerThumb);
        holder.ijkPlayerView.init()
                .setVideoPath("http://ia800208.us.archive.org/4/items/Popeye_forPresident/Popeye_forPresident_512kb.mp4")
                .start();
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private IjkPlayerView ijkPlayerView;

        MyViewHolder(View view) {
            super(view);

            ijkPlayerView = view.findViewById(R.id.player_view);



        }
    }


}

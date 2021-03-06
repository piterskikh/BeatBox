package com.piterskikh.android.beatbox;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piterskikh.android.beatbox.databinding.FragmentBeatBoxBinding;
import com.piterskikh.android.beatbox.databinding.ListItemSoundBinding;

public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment getNewInstance() {
        return new BeatBoxFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentBeatBoxBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_beat_box, container, false);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        binding.recyclerView.setAdapter(new SoundAdapter());
        return binding.getRoot();
    }


    private class SoundHolder extends RecyclerView.ViewHolder{

        SoundHolder(@NonNull final ListItemSoundBinding binding){

            super(binding.getRoot());
        }

    }

    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder>{


        @NonNull
        @Override
        public SoundHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            ListItemSoundBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_sound, viewGroup, false );
            return new SoundHolder(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull SoundHolder soundHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}

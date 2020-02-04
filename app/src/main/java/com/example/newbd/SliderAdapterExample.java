package com.example.newbd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapterExample   extends SliderViewAdapter<SliderAdapterExample.SliderAdapterVH> {

    private Context context;
    TextView textView;

    public SliderAdapterExample(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        // viewHolder.textViewDescription.setText("This is slider item " + position);

        switch (position) {
            case 0:
                viewHolder.imageViewBackground.setImageResource(R.drawable.gari);
                viewHolder.textViewDescription.setText("খ'ন্যাশনাল নিউজ পেপার অলিম্পিয়াড' এর আমিও একজন প্রতিযোগী");

                break;
            case 1:
                viewHolder.imageViewBackground.setImageResource(R.drawable.targeting);
                viewHolder.textViewDescription.setText("আধুনিক এই যুগে আমরা সবাই কম বেশি পেপার পড়ি");

                break;
            default:
                viewHolder.imageViewBackground.setImageResource(R.drawable.gari);
                viewHolder.textViewDescription.setText("অনেকেই দৈনিক সংবাদপত্র পড়ার অভ্যাস রেখেছেন");

                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 3;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}
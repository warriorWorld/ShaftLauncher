package com.harbinger.shaft;

import android.app.Activity;
import android.os.Bundle;

import com.zh.pocket.ads.reward_video.RewardVideoAD;
import com.zh.pocket.ads.reward_video.RewardVideoADListener;
import com.zh.pocket.error.ADError;

import androidx.annotation.Nullable;

/**
 * Created by acorn on 2022/7/10.
 */
public class PlayActivity extends OverrideUnityActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void showRewardAd() {
        RewardVideoAD rewardVideoAD = new RewardVideoAD(this, "id");
        rewardVideoAD.setRewardVideoADListener(new RewardVideoADListener() {
            @Override
            public void onFailed(ADError error) {

            }

            @Override
            public void onSuccess() {

            }

            @Override
            public void onVideoCached() {

            }

            @Override
            public void onADShow() {

            }

            @Override
            public void onADExposure() {

            }

            @Override
            public void onReward() {

            }

            @Override
            public void onADClicked() {

            }

            @Override
            public void onADClosed() {

            }

            @Override
            public void onVideoComplete() {

            }

            @Override
            public void onSkippedVideo() {

            }

            @Override
            public void onADLoaded() {

            }
        });
        rewardVideoAD.loadAD();
    }
}

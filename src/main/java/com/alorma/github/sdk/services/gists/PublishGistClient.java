package com.alorma.github.sdk.services.gists;

import android.content.Context;

import com.alorma.github.sdk.bean.dto.response.Gist;
import com.alorma.github.sdk.services.client.GithubClient;

import retrofit.RestAdapter;
import rx.Observable;

/**
 * Created by Bernat on 03/04/2015.
 */
public class PublishGistClient extends GithubClient<Gist> {
    private Gist gist;

    public PublishGistClient(Context context, Gist gist) {
        super(context);
        this.gist = gist;
    }

    @Override
    protected Observable<Gist> getApiObservable(RestAdapter restAdapter) {
        return restAdapter.create(GistsService.class).publish(gist);
    }
}

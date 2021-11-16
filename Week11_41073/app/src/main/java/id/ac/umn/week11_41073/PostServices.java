package id.ac.umn.week11_41073;

import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface PostServices {
    @GET("posts")
    Call<List<PostModel>> getPosts();

}

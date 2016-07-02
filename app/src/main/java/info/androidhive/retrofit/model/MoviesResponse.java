package info.androidhive.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
// TODO: 7/2/16 3 since we have some extra fields like page number. This class contains all fetched movies and extra information.
image phía dưới:
http://www.androidhive.info/wp-content/uploads/2016/05/android-retrofit-json-viewer.png

phái ngoài ta thấy các roots sau; page, results..... =>
 */
public class MoviesResponse {
    // ta thấy root tên page
    @SerializedName("page")
    private int page;
    // ta thấy root tên resutls
    @SerializedName("results")
    // root này chưa 1 list thì tạo 1 list con trong đây
    private List<Movie> results;

    // các root khác
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}

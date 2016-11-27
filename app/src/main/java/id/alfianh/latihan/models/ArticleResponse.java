

package id.alfianh.latihan.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ArticleResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("new_stories")
    @Expose
    private boolean newStories;

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * @return The code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * @return The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(List<Datum> data) {
        this.data = data;
    }

    /**
     * @return The info
     */
    public Info getInfo() {
        return info;
    }

    /**
     * @param info The info
     */
    public void setInfo(Info info) {
        this.info = info;
    }

    /**
     * @return The pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * @param pagination The pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * @return The newStories
     */
    public boolean isNewStories() {
        return newStories;
    }

    /**
     * @param newStories The new_stories
     */
    public void setNewStories(boolean newStories) {
        this.newStories = newStories;
    }


    @Generated("org.jsonschema2pojo")
    public class Content {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mime")
        @Expose
        private String mime;
        @SerializedName("width")
        @Expose
        private int width;
        @SerializedName("height")
        @Expose
        private int height;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("text")
        @Expose
        private String text;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The mime
         */
        public String getMime() {
            return mime;
        }

        /**
         * @param mime The mime
         */
        public void setMime(String mime) {
            this.mime = mime;
        }

        /**
         * @return The width
         */
        public int getWidth() {
            return width;
        }

        /**
         * @param width The width
         */
        public void setWidth(int width) {
            this.width = width;
        }

        /**
         * @return The height
         */
        public int getHeight() {
            return height;
        }

        /**
         * @param height The height
         */
        public void setHeight(int height) {
            this.height = height;
        }

        /**
         * @return The type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type The type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * @return The text
         */
        public String getText() {
            return text;
        }

        /**
         * @param text The text
         */
        public void setText(String text) {
            this.text = text;
        }

    }

    @Generated("org.jsonschema2pojo")
    public class Datum {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("excerpt")
        @Expose
        private String excerpt;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("timestamp")
        @Expose
        private int timestamp;
        @SerializedName("thumbnail")
        @Expose
        private Thumbnail thumbnail;
        @SerializedName("source")
        @Expose
        private Source source;
        @SerializedName("favorited")
        @Expose
        private boolean favorited;
        @SerializedName("layout")
        @Expose
        private int layout;
        @SerializedName("content")
        @Expose
        private List<Content> content = new ArrayList<Content>();
        @SerializedName("topics")
        @Expose
        private Topics topics;
        @SerializedName("short_url")
        @Expose
        private String shortUrl;

        /**
         * @return The id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return The type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type The type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The excerpt
         */
        public String getExcerpt() {
            return excerpt;
        }

        /**
         * @param excerpt The excerpt
         */
        public void setExcerpt(String excerpt) {
            this.excerpt = excerpt;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The timestamp
         */
        public int getTimestamp() {
            return timestamp;
        }

        /**
         * @param timestamp The timestamp
         */
        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        /**
         * @return The thumbnail
         */
        public Thumbnail getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail The thumbnail
         */
        public void setThumbnail(Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         * @return The source
         */
        public Source getSource() {
            return source;
        }

        /**
         * @param source The source
         */
        public void setSource(Source source) {
            this.source = source;
        }

        /**
         * @return The favorited
         */
        public boolean isFavorited() {
            return favorited;
        }

        /**
         * @param favorited The favorited
         */
        public void setFavorited(boolean favorited) {
            this.favorited = favorited;
        }

        /**
         * @return The layout
         */
        public int getLayout() {
            return layout;
        }

        /**
         * @param layout The layout
         */
        public void setLayout(int layout) {
            this.layout = layout;
        }

        /**
         * @return The content
         */
        public List<Content> getContent() {
            return content;
        }

        /**
         * @param content The content
         */
        public void setContent(List<Content> content) {
            this.content = content;
        }

        /**
         * @return The topics
         */
        public Topics getTopics() {
            return topics;
        }

        /**
         * @param topics The topics
         */
        public void setTopics(Topics topics) {
            this.topics = topics;
        }

        /**
         * @return The shortUrl
         */
        public String getShortUrl() {
            return shortUrl;
        }

        /**
         * @param shortUrl The short_url
         */
        public void setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
        }

    }

    public class Datum_ {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;

        /**
         * @return The id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    public class Info {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private int id;

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type The type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * @return The id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(int id) {
            this.id = id;
        }

    }

    public class Pagination {

        @SerializedName("cursor")
        @Expose
        private int cursor;
        @SerializedName("next_url")
        @Expose
        private Object nextUrl;

        /**
         * @return The cursor
         */
        public int getCursor() {
            return cursor;
        }

        /**
         * @param cursor The cursor
         */
        public void setCursor(int cursor) {
            this.cursor = cursor;
        }

        /**
         * @return The nextUrl
         */
        public Object getNextUrl() {
            return nextUrl;
        }

        /**
         * @param nextUrl The next_url
         */
        public void setNextUrl(Object nextUrl) {
            this.nextUrl = nextUrl;
        }

    }

    public class Source {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("icon")
        @Expose
        private String icon;

        /**
         * @return The id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The icon
         */
        public String getIcon() {
            return icon;
        }

        /**
         * @param icon The icon
         */
        public void setIcon(String icon) {
            this.icon = icon;
        }

    }

    public class Thumbnail {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mime")
        @Expose
        private String mime;
        @SerializedName("width")
        @Expose
        private int width;
        @SerializedName("height")
        @Expose
        private int height;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The mime
         */
        public String getMime() {
            return mime;
        }

        /**
         * @param mime The mime
         */
        public void setMime(String mime) {
            this.mime = mime;
        }

        /**
         * @return The width
         */
        public int getWidth() {
            return width;
        }

        /**
         * @param width The width
         */
        public void setWidth(int width) {
            this.width = width;
        }

        /**
         * @return The height
         */
        public int getHeight() {
            return height;
        }

        /**
         * @param height The height
         */
        public void setHeight(int height) {
            this.height = height;
        }

    }

    public class Topics {

        @SerializedName("data")
        @Expose
        private List<Datum_> data = new ArrayList<Datum_>();

        /**
         * @return The data
         */
        public List<Datum_> getData() {
            return data;
        }

        /**
         * @param data The data
         */
        public void setData(List<Datum_> data) {
            this.data = data;
        }
    }
}
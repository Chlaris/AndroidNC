package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "kma_task_file")
public class TaskFile {
    @PrimaryKey
    @NonNull
    @SerializedName("file_id")
    @Expose
    private Integer file_id;
    @SerializedName("storage")
    @Expose
    private Integer storage;
    @SerializedName("file_path")
    @Expose
    private String file_path;
    @SerializedName("hash_path")
    @Expose
    private String hash_path;
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("file_name")
    @Expose
    private String file_name;
    @SerializedName("mimetype")
    @Expose
    private Integer mimetype;
    @SerializedName("mimepart")
    @Expose
    private Integer mimepart;
    @SerializedName("file_size")
    @Expose
    private String file_size;
    @SerializedName("mtime")
    @Expose
    private Integer mtime;
    @SerializedName("storage_mtime")
    @Expose
    private Integer storage_mtime;
    @SerializedName("encrypted")
    @Expose
    private Integer encrypted;
    @SerializedName("unencrypted_size")
    @Expose
    private Integer unencrypted_size;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("permissions")
    @Expose
    private Integer permissions;
    @SerializedName("checksum")
    @Expose
    private String checksum;

    public TaskFile(@NonNull Integer file_id, Integer storage, String file_path, String hash_path, String parent, String file_name, Integer mimetype, Integer mimepart, String file_size, Integer mtime, Integer storage_mtime, Integer encrypted, Integer unencrypted_size, String etag, Integer permissions, String checksum) {
        this.file_id = file_id;
        this.storage = storage;
        this.file_path = file_path;
        this.hash_path = hash_path;
        this.parent = parent;
        this.file_name = file_name;
        this.mimetype = mimetype;
        this.mimepart = mimepart;
        this.file_size = file_size;
        this.mtime = mtime;
        this.storage_mtime = storage_mtime;
        this.encrypted = encrypted;
        this.unencrypted_size = unencrypted_size;
        this.etag = etag;
        this.permissions = permissions;
        this.checksum = checksum;
    }

    @NonNull
    public Integer getFile_id() {
        return file_id;
    }

    public String getFile_path() {
        return file_path;
    }

    public String getFile_name() {
        return file_name;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}

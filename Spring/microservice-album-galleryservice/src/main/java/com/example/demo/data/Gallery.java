package com.example.demo.data;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Gallery {

private Long galleryId;
private List<Object> images;
public long setGalleryId(long l) {
	// TODO Auto-generated method stub
	return galleryId;
}
public List<Object> setImages(List<Object> list) {
	// TODO Auto-generated method stub
	return images;
	
}


}
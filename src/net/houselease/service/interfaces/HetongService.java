package net.houselease.service.interfaces;

import net.houselease.pojo.Hetong;

public interface HetongService {

	public void inserthetong(Hetong hetong);

	public Hetong findhetong(String house_id);

	public void updatehetong(Hetong hetong);

	public void deletehetong(String house_id);
}

package threesolid;

import threesolid.IWorkable;

class Manager {
	IWorkable worker;

	public void Manager() {

	}
	public void setWorker(IWorkable w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
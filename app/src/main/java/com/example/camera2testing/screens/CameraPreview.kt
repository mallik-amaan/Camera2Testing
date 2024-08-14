package com.example.camera2testing.screens


import android.content.Context
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import androidx.compose.runtime.Composable
import androidx.core.content.ContextCompat.getSystemService

@Composable
fun CameraPreview (){
//    val cameraManager: CameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
//    val cameraIds: Array<String> = cameraManager.cameraIdList
//    var cameraId: String = ""
//    for (id in cameraIds) {
//        val cameraCharacteristics = cameraManager.getCameraCharacteristics(id)
//        //If we want to choose the rear facing camera instead of the front facing one
//        if (cameraCharacteristics.get(CameraCharacteristics.LENS_FACING) == CameraCharacteristics.LENS_FACING_FRONT)
//            continue
//    }
//
//    val previewSize = cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)!!.getOutputSizes(ImageFormat.JPEG).maxByOrNull { it.height * it.width }!!
//    val imageReader = ImageReader.newInstance(previewSize.width, previewSize.height, ImageFormat.JPEG, 1)
//    imageReader.setOnImageAvailableListener(onImageAvailableListener, backgroundHandler)
//    cameraId = id
//}
}



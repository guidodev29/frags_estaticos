package sv.edu.ufg.fis.amb.hdezguido_fras_static

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



class SegundoFragmento : Fragment() {

    lateinit var  mensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        parentFragmentManager.setFragmentResultListener("key",this){requestKey,bundle ->
            val resultReceived = bundle.getString("Valor_campo").toString()
            mensaje.setText(resultReceived)

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.segundo_fragmento, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mensaje = view.findViewById(R.id.txt_text_received)
    }
}
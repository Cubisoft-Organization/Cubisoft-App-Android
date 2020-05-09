package pe.edu.upc.cubisoftapp.ui.rate

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.edu.upc.cubisoftapp.R


class RateFragment : Fragment() {

    companion object {
        fun newInstance() = RateFragment()
    }

    private lateinit var viewModel: RateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rate, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RateViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

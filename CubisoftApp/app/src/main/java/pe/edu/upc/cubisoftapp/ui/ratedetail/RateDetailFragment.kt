package pe.edu.upc.cubisoftapp.ui.ratedetail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.edu.upc.cubisoftapp.R


class RateDetailFragment : Fragment() {

    companion object {
        fun newInstance() =
            RateDetailFragment()
    }

    private lateinit var viewModel: RateDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.rate_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RateDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

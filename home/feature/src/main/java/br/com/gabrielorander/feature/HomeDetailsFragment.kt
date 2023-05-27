package br.com.gabrielorander.feature

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielorander.feature.databinding.FragmentHomeDetailsBinding

class HomeDetailsFragment : Fragment() {

    private lateinit var binding: FragmentHomeDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeDetailsBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }
}
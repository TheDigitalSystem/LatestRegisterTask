package Service;

import Entity.User;
import Repository.UserRepository;
import dto.Response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor // constuctoru nece lazimdi yaradir qardashm kef ele
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    public List<UserResponse> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserResponse.class))
                .collect(Collectors.toList());
    }

    public UserResponse findById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException(
                String.format("User not found by Id -%s", userId)
        ));

        return modelMapper.map(user, UserResponse.class);
    }
}
